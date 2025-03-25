# 🧬 HERENCIA I MODIFICADORS D'ACCÉS EN JAVA 🢆

Aquest document explica com funciona la **herència** i els **modificadors d'accés** (`private`, `default`, `protected`, `public`) a Java, amb exemples de codi i estructura recomanada de paquets.

---

## 📦 Estructura de paquets (simulada)

Per comprendre el comportament dels modificadors d'accés, hem creat una estructura de paquets com la següent:

```
src/
├── paquet1/
│   ├── ClasseA.java
│   ├── ClasseB.java
├── paquet2/
│   ├── ClasseE.java
│   ├── Main.java
```

Cada classe conté mètodes amb diferents modificadors (`private`, `default`, `protected`, `public`) per veure com i on poden ser utilitzats.

---

## 🧠 Resum de comportament per mètodes

| Modificador | Mateixa classe | Mateix paquet | Subclasse (altres paquets) | Qualsevol lloc |
|-------------|----------------|----------------|-----------------------------|----------------|
| `private`   | ✅ Sí           | ❌ No          | ❌ No                        | ❌ No           |
| *(default)* | ✅ Sí           | ✅ Sí          | ❌ No                        | ❌ No           |
| `protected` | ✅ Sí           | ✅ Sí          | ✅ Sí                        | ❌ No           |
| `public`    | ✅ Sí           | ✅ Sí          | ✅ Sí                        | ✅ Sí           |

Aquest resum mostra com el modificador afecta l'accés a mètodes des de diferents ubicacions del projecte.

---

## 🏁 Casos d'ús reals

- 🔐 **`private`** → Protegeix dades internes de la classe (ex: `password`, `config`).
- 🧱 **`default`** → Ideal per funcionalitat que només ha d’estar disponible dins del mateix paquet.
- 🧬 **`protected`** → Permet que les subclasses accedeixin i reutilitzin funcionalitats (patrons com Template Method).
- 🌍 **`public`** → Per a interfícies, classes de servei o mètodes que han de ser accessibles des de qualsevol lloc del projecte o des de llibreries externes.

---

## 💻 Exemple de codi (resum)

### ClasseA.java (paquet1)
```java
public class ClasseA {
    private void metodePrivat() {}
    void metodeDefault() {}
    protected void metodeProtegit() {}
    public void metodePublic() {}
}
```

### ClasseB.java (paquet1)
```java
public class ClasseB {
    public void prova() {
        ClasseA a = new ClasseA();
        // a.metodePrivat(); ❌
        a.metodeDefault();  ✅
        a.metodeProtegit(); ✅
        a.metodePublic();   ✅
    }
}
```

### ClasseE.java (paquet2)
```java
public class ClasseE extends ClasseA {
    public void prova() {
        // metodeDefault(); ❌
        metodeProtegit(); ✅
        metodePublic();   ✅
    }
}
```

### Main.java (paquet2)
```java
public class Main {
    public static void main(String[] args) {
        ClasseA a = new ClasseA();
        // a.metodeDefault(); ❌
        // a.metodeProtegit(); ❌
        a.metodePublic(); ✅
    }
}
```

---

## ✅ Recomanacions

- Usa `private` per a dades o mètodes interns que no han de sortir de la classe.
- Usa `default` si només vols compartir dins d'un paquet.
- Usa `protected` per funcionalitat que poden reutilitzar subclasses.
- Usa `public` per classes i mètodes d'accés general (APIs, punts d'entrada, serveis externs).

---

**Vols veure aquest codi en acció? Consulta els fitxers dins del repositori!**

