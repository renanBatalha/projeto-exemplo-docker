# projeto-exemplo-docker
## Iniciar essa desgraça de postgresql
Baixe essa imagem pelo CMD 
`docker pull postgres`

Depois inicia um container docker
`docker run -d -p 5439:5432 -e POSTGRES_PASSWORD=admin -e POSTGRES_USER=admin -e POSTGRES_DB=mydb -v postgres_data:/var/lib/postgresql/data --name postgres_con postgres`

## Testando a API

Após iniciar os containers, você pode testar a criação de um novo animal usando o Postman:
**Esta animals e não animais pq errei,fiquei com preguiça de mudar, fds**

**Endpoint:** `POST /animals` 
**URL:** `http://localhost:8089/animals`

**Endpoint:** `GET /animals` 
Mostras os animais, pode aparecer ate você aí.

**Exemplo com `Json`:**
```bash
curl -X POST http://localhost:8080/animais \
-H "Content-Type: application/json" \
-d '{
  "nome": "Rex",
  "especie": "Cachorro"
}'
```
