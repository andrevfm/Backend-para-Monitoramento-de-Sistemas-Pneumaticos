# 3ECR:

André Victor Facundes de Melo - 97873;
Erick Rios Sousa - 552251;
Renan Henrique de Oliveira Sousa - 552316;
Pedro Lazzarini Bittencourt de Freitas - 551267.

# Comandos para rodar:

.\mvnw.cmd spring-boot:run

# Localização do banco H2:

./data/readings.mv.db

# Acesso ao Console Web do H2:

http://localhost:8080/h2-console

Configuração de conexão no console:
| Driver Class | org.h2.Driver |
| JDBC URL | jdbc:h2:file:./data/readings |
| User Name | sa |
| Password |  |

# Requisições CURL:

curl -X POST http://localhost:8080/api/readings \
-H "Content-Type: application/json" \
-d '{"sensorId":"sensor1","value":25.7,"timestamp":"2025-06-15T12:30:00"}'

curl http://localhost:8080/api/readings

curl http://localhost:8080/api/readings/sensor1

curl -X DELETE http://localhost:8080/api/readings
