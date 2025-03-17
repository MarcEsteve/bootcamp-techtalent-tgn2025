## 🧠 Resum de comportament per mètodes

| Modificador | Mateixa classe | Mateix paquet | Subclasse (altres paquets) | Qualsevol lloc |
|-------------|----------------|----------------|-----------------------------|----------------|
| `private`   | ✅ Sí           | ❌ No          | ❌ No                        | ❌ No           |
| *(default)* | ✅ Sí           | ✅ Sí          | ❌ No                        | ❌ No           |
| `protected` | ✅ Sí           | ✅ Sí          | ✅ Sí                        | ❌ No           |
| `public`    | ✅ Sí           | ✅ Sí          | ✅ Sí                        | ✅ Sí           |

Aquest resum mostra com el modificador afecta l'accés a mètodes des de diferents ubicacions del projecte.

---

## 🏁 Casos d’ús reals

- 🔐 **`private`** → Protegeix dades internes de la classe (ex: `password`, `config`).
- 🧱 **`default`** → Ideal per funcionalitat que només ha d’estar disponible dins del mateix paquet.
- 🧬 **`protected`** → Permet que les subclasses accedeixin i reutilitzin funcionalitats (patrons com Template Method).
- 🌍 **`public`** → Per a interfícies, classes de servei o mètodes que han de ser accessibles des de qualsevol lloc del projecte o des de llibreries externes.