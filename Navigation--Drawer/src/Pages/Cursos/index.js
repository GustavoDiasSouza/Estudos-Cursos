import React from 'react';
import { View, Text, StyleSheet } from 'react-native';

export default function Cursos({navigation}){
  return (
    <View style={css.container}>
      <Text style={css.TextTitulo} >Lista de Cursos</Text>
      <Text style={css.TextTopico} >Técnico</Text>
      <Text style={css.TextSubtopico} > - Administração (Subsequente | Distância) </Text>
      <Text style={css.TextSubtopico} > - Vestuário (Integrado | Presencial) </Text>
      <Text style={css.TextSubtopico} > - Meio Ambiente (Integrado | Presencial) </Text>
      <Text style={css.TextSubtopico} > - Contabilidade (Subsequente | Distância) </Text>
      <Text style={css.TextSubtopico} > - Desenvolvimento de Sistemas (Subsequente | Presencial) </Text>
      <Text style={css.TextTopico} >Graduação</Text>
      <Text style={css.TextSubtopico} > - Design de Moda (Graduação | Presencial) </Text>
      <Text style={css.TextSubtopico} > - Agroindústria (Graduação | Presencial) </Text>
      <Text style={css.TextSubtopico} > - Gestão Ambiental (Graduação | Presencial) </Text>
      <Text style={css.TextTopico} >Pós-Graduação</Text>
      <Text style={css.TextSubtopico} > - Ciências e Tecnologias na Educação (Mestrado Profissional | Presencial) </Text>
      <Text style={css.TextSubtopico} > - Especialização em Ensino de Matemática para os Anos Iniciais (Especialização | Presencial) </Text>
      <Text style={css.TextTopico} >Especialização Técnica</Text>
      <Text style={css.TextSubtopico} > - Produção e Uso de Plantas Ornamentais e Bioativas (Especialização Técnica | Presencial) </Text>
    </View>
  )
}


const css = StyleSheet.create({

  container: {
    flex: 1,
    height: 1000,
  },

  TextTitulo: {
    textAlign: 'center',
    fontSize: 20,
    color: '#00500f',
    marginTop: 20,
  },

  TextTopico: {
    fontSize: 20,
    color: '#00500f',
    marginLeft: 5,
    padding: 5, 
  },

  TextSubtopico: {
    fontSize: 13,
    color: '#00500f',
    marginLeft: 5,
    marginTop: 2, 
  }



})