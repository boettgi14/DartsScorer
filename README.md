# DartsScorer

A JavaFX-based desktop application for scoring darts games. This application provides a complete scoring system for traditional darts games with various game modes and features.

## Features

- **Multiple Game Modes**: Support for 101, 301, 501, 701, and 1001 point games
- **Finishing Options**: 
  - Single Out (SO)
  - Double Out (DO) 
  - Master Out (MO)
- **Set and Leg Management**: Customizable number of sets and legs
- **Two-Player Support**: Full scoring for two players
- **Real-time Statistics**:
  - Score tracking
  - Average points per throw
  - Checkout suggestions
  - Throws remaining
- **Intuitive GUI**: Clean and user-friendly JavaFX interface
- **Game Management**: Start new games and abort current games

## Installation

### Prerequisites

Make sure you have the following installed on your system:

- **Java 11 or higher**: Download from [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.org/install/)
- **JavaFX 13**: Download from [OpenJFX](https://openjfx.io/openjfx-docs/#install-javafx)
- **Maven**: Download from [Apache Maven](https://maven.apache.org/download.cgi)

### Building from Source

1. Clone or download this repository
2. Navigate to the project directory
3. Build the project using Maven:

```bash
mvn clean compile
```

## Running the Application

### Using Maven

Run the application directly with Maven:

```bash
mvn javafx:run
```

### Using the Built JAR

Build and run the packaged application:

```bash
mvn clean package
```

Then run either:
- **Manual execution**: 
  `java --module-path /path/to/javafx/lib --add-modules ALL-MODULE-PATH -jar target/dartsscorer-1.0-SNAPSHOT.jar` (change "/path/to/javafx/lib" to your local JavaFX directory)
- **Windows shortcut**: `DartsScorer.bat` (requires JavaFX environment variable to be set)

## How to Use

1. **Start a New Game**:
   - Select your desired starting score (101, 301, 501, 701, or 1001)
   - Choose the finishing mode (Single Out, Double Out, or Master Out)
   - Set the number of sets and legs
   - Click "Spiel starten" (Start Game)

2. **Scoring**:
   - Enter scores for each player's throws
   - The application automatically calculates remaining scores and averages
   - Checkout suggestions are provided when players are in finishing range

3. **Game Management**:
   - Track sets and legs won by each player
   - View real-time statistics including averages and throws remaining
   - Abort current games and start new ones as needed

## Technologies Used

- **Java 11**: Core programming language
- **JavaFX 13**: GUI framework
- **Maven**: Build and dependency management
- **FXML**: UI layout definition

## Development

### Available Maven Tasks

- `mvn clean`: Clean the project
- `mvn compile`: Compile the source code
- `mvn clean compile`: Clean and compile
- `mvn javafx:run`: Run the JavaFX application
- `mvn clean package`: Build the complete package

### IDE Setup

This project is configured to work with VS Code and includes tasks for:
- Clean and compile
- Running the JavaFX application
- Packaging the application