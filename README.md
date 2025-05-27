# 🎵 Projeto Sistema de Áudio - OO em Java

Este projeto é um exercício de Orientação a Objetos (OO) desenvolvido em Java, simulando um sistema de gerenciamento de áudios, com classes para músicas e podcasts. O objetivo é praticar conceitos como herança, encapsulamento, polimorfismo e abstração.

---

## 📚 Tecnologias utilizadas

- Java 21
- IDE: IntelliJ IDEA / Eclipse / VSCode (opcional)
- Terminal / CMD

---

## 📌 Descrição do projeto

O projeto consiste em uma superclasse abstrata `Audio`, que representa um áudio genérico com atributos e métodos comuns a músicas e podcasts. A partir dela, são derivadas duas subclasses:

- `Musica`
- `Podcast`

Ambas herdam os atributos e métodos de `Audio` e possuem atributos específicos. Além disso, implementamos um sistema de avaliações para as mídias, onde a classificação é calculada dinamicamente com base nas avaliações recebidas.

---

## 📦 Estrutura do projeto

```
📦 AUDIO
 ┣ 📂 src
 ┃ ┣ 📂 br
 ┃ ┃ ┣ 📂 com
 ┃ ┃ ┃ ┣ 📂 ac
 ┃ ┃ ┃ ┃ ┣ 📂 meusaudios
 ┃ ┃ ┃ ┃ ┃ ┣ 📂 modelos
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜 App.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜 Audio.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜 Musica.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜 Podcast.java
 ┣ 📜 .gitignore
 ┣ 📜 audio.iml
 ┣ 📜 README.md
```

---

## 📖 Funcionalidades

✅ Reproduzir áudios  
✅ Curtir áudios  
✅ Avaliar áudios (de 1 a 5)  
✅ Calcular média de classificação  
✅ Exibir detalhes de músicas e podcasts

---

## 📌 Exemplo de uso

```java
Musica musica1 = new Musica("Fear of the Dark", "Fear of the Dark", "Iron Maiden", "Metal");
musica1.reproduz();
musica1.curte();
musica1.avalia(5);
musica1.avalia(4);
musica1.exibeDetalhes();
```

---

## 📊 Saída esperada

```
Música: Fear of the Dark
Álbum: Fear of the Dark
Artista: Iron Maiden
Gênero: Metal
Total de Curtidas: 1
Total de Reproduções: 1
Classificação: 4
```

---

## 🎯 Conceitos de OO aplicados

- **Abstração**: Classe `Audio` é abstrata e define métodos comuns.
- **Herança**: `Musica` e `Podcast` herdam de `Audio`.
- **Encapsulamento**: Uso de `private` e `protected` com getters e setters.
- **Polimorfismo**: Método `exibeDetalhes()` implementado de forma distinta nas subclasses.

---

## 📌 Melhorias possíveis

- Adicionar comentários nas avaliações
- Permitir remover curtidas ou avaliações
- Salvar histórico de avaliações
- Implementar persistência em arquivo ou banco de dados

---

## 🚀 Como executar o projeto

1. Clone o repositório:
   ```
   git clone https://github.com/seu-usuario/projeto-audio-java.git
   ```
2. Abra o projeto na sua IDE Java de preferência.
3. Execute a classe `App.java` localizada em:
   ```
   src/br/com/ac/meusaudios/modelos/App.java
   ```

---

## 📝 Autor

Anderson Chaves  
[LinkedIn](https://www.linkedin.com/in/developer-anderson-chaves/) | [GitHub](https://github.com/AndersonChavesS)

---
