# dockerswarm
1) install docker on ubuntu


sudo apt install docker.io
------add user in docker group----------------------
sudo usermod -aG docker ${USER}

2) Install Docker Compose
install Docker compose
sudo curl -L "https://github.com/docker/compose/releases/download/1.24.0/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
sudo chmod +x /usr/local/bin/docker-compose
sudo ln -s /usr/local/bin/docker-compose /usr/bin/docker-compose
docker-compose --version

3)Docker Commands

a)For see the images on local system

docker images
docker image ls

b) build docker image
docker build -t config-server .
docker image build -t config-server .

c)run docker image 
docker run --network college-ms --name apigateway -p 8080:8080 -d apigateway
docker container run --network college-ms --name apigateway -p 8080:8080 -d apigateway

d)see docker process
docker ps

e)see docker containers
docker container ls

f)docker log

docker logs 2digt of container id
docker container logs 2digt of container id

g) run command inside of docker
docker exec -it 37(container id) echo "hello"'
docker container exec -it 37(container id) echo "hello"

h)Stop start container
docker container stop containerid
docker container start containerid

i)docker image remove
docker image rm <Repository>

j)Docker network 
docker network ls
docker network create <networkname>

k)Docker Compose
docker-compose up
docker-compose down

l)Docker hub login
docker login

m)tag image
docker image tag soucre_image dest_image
docker image tag employee-producer javainuse/employee-producer

n)Push image on docker hub
docker image push <imaage name>

o)Docker swarm
docker swarm init --advertise-addr <IP>
docker swarm join --token <token> <ip:port>
docker swarm join --token SWMTKN-1-589ajd3me7whpnck0478a0titc98pcojl3kuyeovgs48rvdcla-13eg6czt4wvmjncbv1g0zzgya 192.168.0.23:2377
docker node ls
docker network create --driver overlay producer-consumer
docker service create --network producer-consumer --name producer -p 8080:8080 javainuse/employee-producer
docker service ls
docker stack deploy -c docker-compose.yaml testStack
docker stack ls

