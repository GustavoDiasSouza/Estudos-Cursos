module "aws-dev" {
  source = "../../infra"  
  instancia = "t2.micro"
  regiao_aws = "us-east-1"
  chave = "IaC-Prod"
  Nome_instancia = "Terraform & Ansible v3 Prod"
  ambiente = "Prod"
}

output "IP" {
  value = module.aws-dev.IP_publico
}