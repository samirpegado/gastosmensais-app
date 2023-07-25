# Programa de Gastos Mensais

## Descrição

O Programa de Gastos Mensais é uma aplicação que permite aos usuários controlarem suas despesas e receitas de forma eficiente. Ele oferece recursos para realizar o login, registrar novas contas, adicionar e visualizar despesas e receitas, além de fornecer detalhes sobre as despesas por categoria.

## Funcionalidades

### Tela de Login (TODO)

Apresenta a tela de login com os seguintes elementos:
- Botão de "Login": Ao clicar, abrirá uma janela para inserir e-mail e senha.
- Botão de "Registrar": Ao clicar, abrirá uma janela com campos para preencher (nome, último nome, e-mail e senha) para criar uma nova conta.

### Tela de Registro (TODO)

Ao selecionar o botão "Registrar", apresenta os campos a serem preenchidos pelo usuário:
- Nome.
- Último nome.
- E-mail.
- Senha.

### Tela Principal (Tela 1) (TODO)

Após o login bem-sucedido, saúda o usuário com uma mensagem de "Hello, [username]".
Exibe uma faixa com o mês do balancete atual.
Inclui um botão de seta para baixo ("arrow down"), permitindo selecionar meses passados ou futuros.
Adiciona um botão de "Adicionar" no canto inferior direito, que permite ao usuário inserir novas despesas e receitas.

### Adicionar Despesas e Receitas (TODO)

Ao clicar no botão "Adicionar", abre uma janela com os seguintes campos a serem preenchidos:
- Valor: montante da despesa ou receita.
- Título: descrição curta da despesa ou receita.
- Categoria: seleção da categoria associada à despesa/receita (criar um Plano de Contas com categorias predefinidas).
- Descrição: campo opcional para adicionar mais detalhes sobre a transação.
- Data: data da despesa ou receita.
- Despesa se repete? Opção para marcar se a despesa se repete em meses seguintes.
- Se sim, em quantos meses: campo para indicar em quantos meses a despesa se repetirá.

### Exibição das Receitas e Despesas (TODO)

Na tela principal (Tela 1), exibe as receitas acima e as despesas abaixo.
Agrupa as despesas e receitas por categoria.
Exibe os valores totais de receitas e despesas para o mês corrente.

### Detalhes das Despesas (TODO)

Ao clicar em uma categoria específica, abre uma nova tela (Tela 2) que mostra os detalhes sobre cada despesa associada a essa categoria.
Na tela de detalhes (Tela 2), permite a exclusão e edição de cada despesa individualmente.

## Armazenamento em API (TODO)

Integra todas as informações inseridas em uma base de dados na forma de API.
Garante que os dados sejam armazenados de forma segura e protegida.

## Tecnologias Utilizadas

- Linguagem de programação: [Kotlin].
- Plataforma: [Android Studio].
- Banco de Dados/API: [SQLite].
