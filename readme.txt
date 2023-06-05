#Passos para realizar a execução do ambiente

1- main.tf -> subistituir o 'key_name:' por sua chave par da AWS.
2- Conferir a região que for executadar é a mesma da chave par.
3- AMI utilizado é de ubuntu 22, disponivel no free tier -> ami-095413544ce52437d.
4- colocar sua chave par junto dos arquivos.

#Terraform

!Executar os comando sempre na pasta que estão os arquivos!

1- terraform init
2- terraform apply
3- Conectar a maquina EC2 pelo ssh
4- cd /home/ubuntu 
5- mkdir dev/
6- cd dev/
7- mkdir venv/

#Ansible

!Executar os comando sempre na pasta que estão os arquivos!

1- No arquivo 'hosts.yml' trocar pelo endereço da sua maquina EC2.
2- ansible-playbook playbook.yml -u ubuntu --private-key nomeDoSeuArquivo.pem -i hosts.yml
3- Acessar a maquina no EC2 pelo ssh.
4- cd /home/ubuntu/dev/
5- . venv/bin/activate
6- python manage.py runserver 0.0.0.0:8000

!Para rodar novamente é preciso remover manage.py e o setup/ em dev/ antes de executar o Ansible.

