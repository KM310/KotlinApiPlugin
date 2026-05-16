# KotlinRuntimeProvider

A PaperMC plugin that provides the **Kotlin Standard Library** (kotlin-stdlib) globally on the server.  
This allows Kotlin-based plugins to run **without bundling their own Kotlin runtime**, reducing file size and preventing runtime errors.

---

## ✨ Features

- Provides the **Kotlin Standard Library** at runtime
- Allows Kotlin plugins to work even if they do not include the stdlib
- Prevents common errors such as  
  `java.lang.NoClassDefFoundError: kotlin/...`
- Reduces duplicated Kotlin runtime copies across multiple plugins
- Fully compatible with PaperMC

---

## 📦 Included Kotlin Libraries

This plugin bundles the following Kotlin libraries:

- `kotlin-stdlib`

(If you add more Kotlin modules later, list them here.)

All included Kotlin components are licensed under the **Apache License 2.0**.

---

## 📥 Installation

1. Download the latest release from the Releases page  
2. Place the JAR into your server’s `plugins/` directory  
3. Restart the server  
4. Kotlin plugins can now run without shipping their own stdlib

---

## 🧪 Compatibility

- **PaperMC 1.20+**
- Works with any Kotlin-based plugin that depends on the stdlib
- Zero configuration required

---

## 📄 Licenses

### Project License
This project is licensed under **YOUR LICENSE HERE**.  
(Replace this section with your actual license.)

---

### Third-Party Licenses

This project bundles the following third-party components:

#### **Kotlin Standard Library**  
License: Apache License 2.0  
Included files:

- `THIRD_PARTY_LICENSES/APACHE-KOTLIN.txt`
- `THIRD_PARTY_LICENSES/NOTICE-KOTLIN.txt`
- `THIRD_PARTY_LICENSES/COPYRIGHT-KOTLIN.txt`

---

### Used but Not Bundled

#### **Paper API**  
License: MIT License  
The Paper API is **not** distributed with this plugin; it is used only for compilation.  
Optional license reference:

- `THIRD_PARTY_LICENSES/MIT-PAPER.txt`

---

## 🛠️ Development

This plugin is written in **Kotlin** and uses:

- Gradle (Kotlin DSL)
- PaperMC API
- Kotlin Standard Library (bundled)

---

## 🤝 Contributing

Contributions are welcome.  
Please ensure that:

- Code style is followed  
- No additional libraries are bundled without proper license review  
- Third-party licenses are added when required  

---

## ❤️ Acknowledgements

Special thanks to:

- JetBrains for Kotlin  
- PaperMC for the API  
- The open-source community

