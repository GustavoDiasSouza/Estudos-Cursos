terraform {
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "~> 4.16"
    }
  }

  required_version = ">= 1.2.6"
  
}

provider "aws" {
  region  = var.regiao_aws
  access_key = "XXX"
  secret_key = "XXX"
}

resource "aws_instance" "app_server" {
  ami           = "ami-053b0d53c279acc90"
  instance_type = var.instancia
  key_name = var.chave
  tags = {
    Name = var.Nome_instancia
  }
  vpc_security_group_ids = [aws_security_group.acesso_geral.id]
}

resource "aws_key_pair" "chaveSSH" {
  key_name = var.chave
  public_key = file("${var.chave}.pub")
}

output "IP_publico" {
  value = aws_instance.app_server.public_ip
}
