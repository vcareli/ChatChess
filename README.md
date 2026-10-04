🐱 Xadrez Felino

Um jogo de xadrez em Java onde as peças tradicionais foram substituídas por gatos! Porque xadrez é sério demais para não ter bigodes.
📖 Sobre o projeto

Este projeto implementa as regras clássicas do xadrez, mas com um toque felino: cada peça é representada por um gato diferente. O objetivo é unir o aprendizado de Programação Orientada a Objetos em Java com a diversão de ver gatos dominando o tabuleiro.

🐾 As peças
Peça tradicional	Gato	Emoji
Peão	Gatinho filhote	🐱
Torre	Gato gordo	🐈
Cavalo	Gato saltitante	😼
Bispo	Gato sábio	🙀
Rainha	Gata elegante	😻
Rei	Gato chefe	😾
✨ Funcionalidades

    □

    Tabuleiro 8x8 com peças de gato
    □

    Movimentação válida de cada peça
    □

    Alternância de turnos (brancas e pretas)
    □

    Captura de peças
    □

    Detecção de xeque
    □

    Detecção de xeque-mate
    □

    Interface gráfica (Swing/JavaFX)
    □

    Movimentos especiais (roque, en passant, promoção)

🛠️ Tecnologias

    Java (JDK 17+)

    Paradigma: Programação Orientada a Objetos

    Interface: a definir (console, Swing ou JavaFX)

📂 Estrutura do projeto
xadrez-felino/
├── src/
│   ├── main/
│   │   ├── Main.java
│   │   ├── jogo/
│   │   │   ├── Tabuleiro.java
│   │   │   └── Jogo.java
│   │   └── pecas/
│   │       ├── Peca.java
│   │       ├── Peao.java
│   │       ├── Torre.java
│   │       ├── Cavalo.java
│   │       ├── Bispo.java
│   │       ├── Rainha.java
│   │       └── Rei.java
├── README.md
└── .gitignore

🚀 Como rodar
Pré-requisitos

    Java JDK 17 ou superior instalado

    Git (opcional)

Passos

# Clone o repositório
git clone https://github.com/seu-usuario/xadrez-felino.git

# Entre na pasta
cd xadrez-felino

# Compile
javac -d bin src/main/**/*.java

# Execute
java -cp bin main.Main

🎮 Como jogar

(a definir quando a interface estiver pronta)

Por enquanto, o jogo será via console com coordenadas no formato linha coluna (ex: 1 4 para mover o rei branco).
🗺️ Roadmap

    ☑

    Definir tema (gatos 🐱)
    □

    Criar classe Peca e subclasses
    □

    Implementar tabuleiro 8x8
    □

    Implementar regras de movimento
    □

    Adicionar turnos
    □

    Detectar xeque e xeque-mate
    □

    Criar interface gráfica
    □

    Adicionar sons de miado ao mover peças 🎵

🤝 Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

    Faça um fork do projeto

    Crie uma branch (git checkout -b feature/minha-feature)

    Commit suas mudanças (git commit -m 'Adiciona nova feature')

    Push para a branch (git push origin feature/minha-feature)

    Abra um Pull Request

📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.
🐈‍⬛ Créditos

Desenvolvido com ☕ e muita companhia felina.
