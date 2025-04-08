# Simulando uma Lanchonete - Java Cloud Native Bootcamp

Este projeto foi desenvolvido como parte do **Bootcamp Java Cloud Native**, com o objetivo de praticar os conceitos de **Programação Orientada a Objetos (POO)** em Java.

## 🧠 O que foi praticado

- Criação e organização de classes e pacotes
- Encapsulamento com os modificadores de acesso: `private`, `default` e `public`
- Relação entre objetos (Cliente, Atendente, Cozinheiro, Almoxarife)
- Simulação de um fluxo real de uma lanchonete: do pedido ao pagamento

---
## 🧩 Descrição das Classes

### ✅ Cozinheiro
- Prepara lanches, sucos e combos.
- Usa métodos `private` para etapas internas do preparo e `public` para adicionar os itens ao balcão.

### ✅ Almoxarife
- Entrega ingredientes e realiza trocas como a do gás.
- Métodos com visibilidade `default` e `private`.

### ✅ Atendente
- Serve os pedidos e recebe os pagamentos.
- Interage com a cozinha e com o cliente.

### ✅ Cliente
- Escolhe o lanche, faz o pedido e paga a conta.
- Usa métodos `public` e `private`.

### ✅ Estabelecimento (Main)
- Classe principal onde todas as interações são simuladas através da criação de objetos.

## Aprendizados
Durante o desenvolvimento deste projeto, pude reforçar:

- A organização de um sistema realista com múltiplas classes e pacotes

- O uso adequado dos modificadores de acesso private, default e public

- A importância da separação de responsabilidades entre as classes
