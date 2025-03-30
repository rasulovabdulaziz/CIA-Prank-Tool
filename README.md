## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

# CIA-Prank-Tool
FBI is on its way. Thanks for your passport! 😂

A fun Java project to prank your friends! Enter your name, surname, and passport series – and get a hilarious surprise! 🎭  

## 🚀 Features  
✅ **Regex-based input validation**:  
   - Name & surname: **Only letters** (no numbers or symbols)  
   - Passport series: **Only numbers** (no letters or extra characters)  

✅ **Auto-generates a unique 10-digit registration number** 📑:  
   - First 4 digits → **Year of registration**  
   - Next 2 digits → **Month of registration**  
   - Last 4 digits → **Order number**  

✅ **Generates a secure password** 🔐:  
   - First 2 characters → **First two letters from passport series**  
   - Last 4 characters → **Last four digits of passport series**  

✅ **Generates a random login ID** 🔢  
   - Stored for reference  
   - Displayed on the generated image  

✅ **Inserts all data into an image** 🖼  
   - Name & Surname  
   - Passport Number  
   - Generated Login  
   - Generated Password  

✅ **Plays a meme sound for extra fun** 🔊  

## 🔧 Technologies Used  
- **Java** ☕  
- **Regex (Pattern & Matcher)** for input validation 🔍  
- **Swing/JavaFX** for UI (if applicable) 🎨  
- **Java Sound API** for playing audio 🎵  
- **BufferedImage & Graphics2D** for editing images 🖼  
