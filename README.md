<h1 align="center">🪄 Gif-it-up </h1>
</br>
<div align="center"> 
  <img src="https://media3.giphy.com/media/v1.Y2lkPTc5MGI3NjExeWc4bWs5Y2cxeTRzZ3Y2b2w2eXNja3B4M2xzeG1tZGtjN2YydTlpbCZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/KxiRwO7tqXCTDVKobo/giphy.gif" alt="Fun GIF" width="300" height="300">
</div>
</br>
<div align="center"> <i> A fun little project to turn boredom into GIFs </i> </div>

---

## ✨ What is this?

**Gif-it-up** is a tiny Spring Boot + Thymeleaf app I hacked together just for fun.  
No fancy databases. No serious business logic. Just a way to mess around and make some GIFs.  

---

## 🌟 Features

- **📤 Upload Images**
  - Upload multiple images from your system
- **🎞️ Generate GIF**
  - Convert uploaded images into an animated GIF
  - Set speed and loop options
- **📁 Download GIF**
  - Save generated GIF locally
- **🖼️ Web UI**
  - Thymeleaf-powered interface for smooth user experience

---

## 🛠️ Tech Stack

| Category       | Technologies                                                                                                           |
|----------------|-----------------------------------------------------------------------------------------------------------------------|
| **Backend**    | <img src="https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white" /> <img src="https://img.shields.io/badge/Java-21-007396?style=for-the-badge&logo=java&logoColor=white" /> |
| **Frontend**   | <img src="https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white" /> <img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white" /> <img src="https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white" /> |
| **Build Tool** | <img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" /> |

---

## 📁 Directory Structure

```
Gif-it-up/
├── 📂 src/
│ ├── 📂 main/
│ │ ├── 📂 java/com/example/gifmaker/
│ │ │ ├── controller/ # Controllers for handling upload & GIF generation
│ │ │ ├── service/ # Services for image/GIF processing
│ │ │ └── GifMakerApplication.java # Main Spring Boot application
│ │ └── 📂 resources/
│ │ ├── application.properties # Configurations
│ │ ├── static/ # CSS, JS, images
│ │ └── templates/ # Thymeleaf templates
├── 📄 pom.xml # Maven dependencies
├── 📄 render.yaml # Deployment config for Render
├── 📄 system.properties # Runtime Java version (21)
└── 📄 README.md # Project documentation
```

---

## ⚙️ Getting Started

### Prerequisites
- Java 21  
- Maven

---

### 🚀 How to Run (if you’re curious)

1. **Clone the Repository**:
   ```bash
   git clone [https://github.com/Anmol283/E-commerceMiniStore](https://github.com/Anmol283/Gif-it-up)
   cd  Gif-it-up
   ```

2. **Build and run the application**:
   ```
   mvn clean install
   mvn spring-boot:run
   ```
   
3. **Run the application**:
   ```
   http://localhost:8080
   ```
---
## 🎯 Usage
- Upload one or more images.
- Choose speed/loop options.
- Generate your GIF.
- Download the final animated file.

---

## 🤝 Contributing
Honestly, it’s just for fun. But if you want to add wild features (like rainbow filters 🌈 or meme text 🤣), feel free to fork and PR!
1. Fork the repository
2. Create a new branch (`git checkout -b feature-branch`)
3. Make your changes and commit (`git commit -m "Add feature"`)
4. Push to the branch (`git push origin feature-branch`)
5. Create a Pull Request

---

## 📜 License

This project is licensed under the MIT License - see the LICENSE file for details.

---

<i><b>✨ Because life’s too short for static images.</b></i>

