# Conversor de Moedas 💱

![Java](https://img.shields.io/badge/Java-11%2B-blue?logo=java)
![License](https://img.shields.io/badge/License-MIT-green)
![Build](https://img.shields.io/badge/Build-Passing-brightgreen)
![API](https://img.shields.io/badge/API-ExchangeRate-orange?logo=api)
![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow)

---

## 📌 Descrição
Este projeto é um **Conversor de Moedas em Java** que utiliza a **ExchangeRate API** para obter taxas de câmbio em tempo real.  
O programa oferece um **menu interativo** no console com diversas opções de conversão entre moedas (BRL, USD, EUR, RUB).  

Cada conversão realizada é registrada em um arquivo de log (`conversoes.log`) com **data e hora**, e o usuário pode consultar o histórico diretamente pelo programa.

---

## 🚀 Funcionalidades
- Conversão entre 6 pares de moedas:
  - BRL → USD  
  - USD → BRL  
  - BRL → EUR  
  - EUR → BRL  
  - BRL → RUB  
  - RUB → BRL  
- Registro automático de cada conversão em arquivo (`conversoes.log`).  
- Exibição do histórico de conversões no menu.  
- Menu interativo com opção de sair ou continuar.  

---

## 🛠️ Estrutura do Projeto
- **Principal.java** → Classe principal com menu e interação com usuário  
- **ConsultaMoeda.java** → Responsável por consultar a API de câmbio  
- **RegistroLog.java** → Responsável por salvar cada conversão no arquivo de log  
- **HistoricoConversoes.java** → Responsável por ler e exibir o histórico de conversões  

---

## 📂 Exemplo de Log
Arquivo `conversoes.log` gerado automaticamente:

<img width="495" height="232" alt="{4C7619F0-C4AB-458B-9396-F7EC5BF8474F}" src="https://github.com/user-attachments/assets/5df862b0-00bb-4f10-b862-3feb41764738" />


---

## ⚙️ Pré-requisitos
- **Java 11+** (necessário para usar `HttpClient`)  
- Biblioteca **Gson** para manipulação de JSON  
  - Baixar em: [https://github.com/google/gson](https://github.com/google/gson)  
  - Adicionar ao classpath do projeto  

---

## ▶️ Como executar
1. Clone ou baixe este repositório  
2. Configure sua **API Key** da [ExchangeRate API](https://www.exchangerate-api.com/)  
   - Substitua no código:  
     ```java
     String chave = "SUA_CHAVE_AQUI";
     ```
3. Compile os arquivos:
   ```bash
   javac -cp .;gson.jar Principal.java ConsultaMoeda.java RegistroLog.java HistoricoConversoes.java


 ## 📌 Melhorias futuras
- Adicionar mais pares de moedas

- Interface gráfica (Swing/JavaFX)

- Exportar histórico em CSV ou PDF

 
 ## 📜 Licença
- Este projeto está licenciado sob a licença MIT.
- Sinta-se livre para usar, modificar e distribuir.

   



