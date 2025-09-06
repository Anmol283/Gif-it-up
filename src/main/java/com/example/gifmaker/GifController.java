package com.example.gifmaker;

import com.madgag.gif.fmsware.AnimatedGifEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Controller
public class GifController {

    private byte[] latestGif; // keep the last generated GIF in memory

    @GetMapping("/")
    public String uploadPage() {
        return "upload"; // loads upload.html
    }

    @PostMapping("/create-gif")
    public String createGif(MultipartFile[] images, Model model) throws IOException {
        if (images == null || images.length == 0) {
            model.addAttribute("error", "Please upload at least one image.");
            return "upload";
        }

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        AnimatedGifEncoder gifEncoder = new AnimatedGifEncoder();
        gifEncoder.start(baos);
        gifEncoder.setDelay(500); // 500ms per frame
        gifEncoder.setRepeat(0);  // infinite loop

        for (MultipartFile file : images) {
            BufferedImage img = ImageIO.read(file.getInputStream());
            if (img != null) {
                gifEncoder.addFrame(img);
            }
        }
        gifEncoder.finish();

        latestGif = baos.toByteArray(); // store in memory

        // Pass GIF URL to template
        model.addAttribute("gifUrl", "/download-gif");
        return "upload";
    }

    @GetMapping(value = "/download-gif", produces = "image/gif")
    @ResponseBody
    public byte[] downloadGif() {
        return latestGif;
    }
}
