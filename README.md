# dockerswarm
docker swarm init
docker network create --driver overlay employee-salary
docker service create --network employee-salary --name employee -p 8080:8080 vivekjdocker/employee
docker service create --network employee-salary --name salary -p 9090:9090 vivekjdocker/salary