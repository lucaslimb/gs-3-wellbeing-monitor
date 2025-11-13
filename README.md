# ☕︎ Global Solution - Microservice and Web Engineering

## 👥 Membros do Grupo

- **Lucas de Lima** - RM98632
- **Martin Hilst** - RM99451

## 📝 Tema

**Ferramentas de monitoramento de bem-estar e saúde mental**

> Explora soluções digitais que ajudam a acompanhar o bem-estar emocional e promover hábitos saudáveis por meio de tecnologias acessíveis e intuitivas.

## 💡 Finalidade da API

A API fornece informações básicas sobre o tema escolhido, permitindo consultas via endpoint REST `/info` e documentação Swagger. Serve como ponto inicial para aplicações que precisam expor dados sobre monitoramento de bem-estar e saúde mental.

## 💻 Stack Utilizada

- Java 17/18
- Spring Boot 3.4.5
- Maven
- Docker

**Dependências:**
- Spring Web
- SpringDoc OpenAPI

---

## 🚀 Execução Local

### A partir da imagem no Docker Hub

1. **Inicie o container:**
```bash
docker run -d --name tema-api --network app-networks -p 8081:8081 lucaslimb/gs-3-wellbeing-monitor:latest
```

#### URL da imagem no Docker Hub:
lucaslimb/gs-3-wellbeing-monitor:latest

### A partir do docker-compose

1. Subir os serviços:
```bash
 docker-compose up -d
```

### 🌐 Acesso ao Swagger
```
http://localhost:8081/swagger-ui.html
ou
http://localhost:8081/swagger-ui/index.html
````


### ⚙️ Workflows CI/CD Implementados

#### O repositório possui workflows para automação de versionamento e CI/CD:

1. Release-Please (Maven):
Gera automaticamente tags e releases baseadas em commits na branch main
Atualiza versão no pom.xml
Cria changelog automaticamente
Executado via GitHub Actions, registro de execução disponível na aba Actions

2. Build e Teste Maven):
Valida o build da aplicação antes de gerar a release
Garante que apenas código funcional seja publicado

### 📓 Referências

SpringDoc OpenAPI