import React from 'react';
import { View, Text, StyleSheet } from 'react-native';

export default function TDS({navigation}){
  return (
    <View style={css.cotainer}>
      <Text style={css.TextTitulo}>Descrição</Text>
      <Text style={css.TextList}> - Título: Técnico em Desenvolvimento de Sistemas. </Text>
      <Text style={css.TextList}> - Nível de ensino: Técnico. </Text>
      <Text style={css.TextList}> - Turno(s): Tarde. </Text>
      <Text style={css.TextList}> - Modalidade: Presencial. </Text>
      <Text style={css.TextList}> - Carga Horária: 1080h. </Text>
      <Text style={css.TextList}> - Duração: Quatro semestres. </Text>
      <Text style={css.TextList}> - Estágio: Não Obrigatório. </Text>

      <Text style={css.TextTopico}>Perfil</Text>
      <Text style={css.TextDetalhe}>O Técnico em Desenvolvimento de Sistemas é o profissional com formação ética, técnica, crítica, criativa, empreendedora e humanística capaz de desenvolver sistemas computacionais utilizando ambiente de desenvolvimento. Modelar, implementar e manter banco de dados. Utilizar linguagem de programação específica. Realizar testes de programas de computador. Manter registros para análise e refinamento de resultados. Elaborar documentação do sistema. Aplicar princípios e definição de análise de dados. Executar manutenção de programas de computador.</Text>

      <Text style={css.TextTopico}>Campo de atuação</Text>
      <Text style={css.TextDetalhe}>O egresso do Curso Técnico em Desenvolvimento de Sistemas poderá atuar em empresas de desenvolvimento de sistemas e departamentos de desenvolvimento de sistemas em organizações governamentais e não governamentais, bem como poderá desenvolver atividades como profissional autônomo. ! O melhor de todos !  </Text>
    </View>
  )
}


const css = StyleSheet.create({

  cotainer: {
    flex: 1,
    padding: 10,
    
  },

  TextTitulo: {
    fontSize: 18,
    marginTop: 5,
    marginBottom: 5,
    color: '#00500f',
  },
  
  TextList: {
    fontSize: 11,
    marginBottom: 3,
    color: '#00500f',
  },

  TextTopico: {
    fontSize: 18,
    marginTop: 10,
    marginBottom: 5,
    color: '#00500f',
  },

  TextDetalhe: {
    fontSize: 12,
    color: '#00500f',
  }

})