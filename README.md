# Simples Calc

A minimalist Android calculator app with a clean and simple design.

## Overview

**Simples Calc** is a lightweight, user-friendly calculator application for Android devices. It features a minimalist interface with all essential mathematical operations:

- Basic arithmetic operations (addition, subtraction, multiplication, division)
- Decimal number support
- Clear function to reset calculations
- Real-time display updates

## Features

✨ **Minimalist Design** - Clean and simple UI with a focus on usability

🧮 **Essential Operations** - Addition, subtraction, multiplication, and division

📱 **Mobile Optimized** - Responsive layout that works on various Android device sizes

💻 **Modern Development Stack** - Built with Kotlin, AndroidX, and Material Design principles

⚡ **Lightweight** - Minimal dependencies for fast installation and execution

## Project Structure

```
simples-calc/
├── app/
│   ├── build.gradle                    # App build configuration
│   └── src/
│       └── main/
│           ├── AndroidManifest.xml     # App manifest
│           ├── java/
│           │   └── com/example/simplescalc/
│           │       └── MainActivity.kt  # Main activity with calculator logic
│           └── res/
│               ├── layout/
│               │   └── activity_main.xml # UI layout with buttons and display
│               └── values/
│                   └── strings.xml      # String resources
├── build.gradle                        # Root build configuration
├── settings.gradle                     # Gradle settings
├── .gitignore                          # Git ignore file
└── README.md                           # This file
```

## Technologies Used

- **Language**: Kotlin
- **Android Version**: API 24 (Android 7.0) - 34 (Android 14)
- **Build System**: Gradle
- **UI Framework**: AndroidX, Material Design
- **IDE**: Android Studio

## Requirements

- Android SDK 24 or higher
- Kotlin 1.9.0 or higher
- Gradle 8.1.0 or higher

## Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/rogersneves/simples-calc.git
   cd simples-calc
   ```

2. Open the project in Android Studio:
   - File → Open → Select the project directory

3. Build the project:
   - Build → Make Project

4. Run the app:
   - Click the green Run button or press Shift + F10
   - Select your emulator or connected device

## Usage

1. **Enter Numbers**: Tap the number buttons (0-9) to enter values
2. **Decimal Numbers**: Tap the dot (.) button to add decimal points
3. **Operations**: Select an operation (+, -, *, /)
4. **Calculate**: Tap the equals (=) button to see the result
5. **Clear**: Tap the C button to reset and start a new calculation

### Example Calculations

- Simple Addition: `5 + 3 =` → `8`
- Multiplication: `12 * 5 =` → `60`
- Decimal Operations: `10.5 + 2.5 =` → `13.0`
- Division: `20 / 4 =` → `5.0`

## Code Overview

### MainActivity.kt

The main activity contains:
- UI component initialization (buttons and display)
- Event listeners for button clicks
- Calculation logic for arithmetic operations
- Display management

### activity_main.xml

The layout file defines:
- LinearLayout as the main container
- TextView for the display
- GridLayout for organizing calculator buttons
- Button widgets for numbers and operations

## Building APK

To build a release APK:

```bash
# Development APK
./gradlew assembleDebug

# Release APK (requires signing configuration)
./gradlew assembleRelease
```

The APK will be generated in the `app/build/outputs/apk/` directory.

## Future Enhancements

- [ ] History of calculations
- [ ] Scientific calculator mode
- [ ] Dark mode theme
- [ ] Keyboard input support
- [ ] Undo/Redo functionality
- [ ] Landscape mode optimization
- [ ] Unit conversion features
- [ ] Memory functions (M+, M-, MC)

## Contributing

Contributions are welcome! Feel free to:
1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Author

**Rogers Neves** - [GitHub](https://github.com/rogersneves)

## Acknowledgments

- Android documentation and best practices
- AndroidX libraries and support
- Material Design guidelines

## Support

If you encounter any issues or have suggestions:
1. Open an [Issue](https://github.com/rogersneves/simples-calc/issues) on GitHub
2. Provide detailed information about the problem
3. Include device/OS information if applicable

---

**Last Updated**: December 18, 2025

Enjoy using Simples Calc! 🚀
