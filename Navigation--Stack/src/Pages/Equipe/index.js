import React from 'react';
import { View, Text, StyleSheet } from 'react-native';

// AQUI !!!!!!!!
// OI, Foi colocado o máximo de conteudo que consegui pq não sei usar o "overflow" aqui ainda :D
// Mantive os bottões da página original do CAVG.


export default function Equipe({navigation}){
  return (
    <View>
      <Text style={css.TextTitulo} >DIRETOR GERAL DO CÂMPUS PELOTAS - VISCONDE DA GRAÇA</Text>
      <Text style={css.TextDescrisao} > Marcos André Betemps Vaz da Silva </Text>
      <Text style={css.TextTitulo} >DIRETORIA ADJUNTA</Text>
      <Text style={css.TextDescrisao} > Paula Rodrigues Bittencourt de Carvalho Leite </Text>
      <Text style={css.TextTitulo} >ASSESSORIA DO DIRETOR-GERAL</Text>
      <Text style={css.TextDescrisao} > Caciane Barbosa Mesko </Text>
      <Text style={css.TextTitulo} >CHEFE DE GABINETE DO DIRETOR-GERAL</Text>
      <Text style={css.TextDescrisao} > Eduardo Vieira dos Anjos </Text>
      <Text style={css.TextTitulo} >COORDENADORIA DE ASSISTÊNCIA ESTUDANTIL</Text>
      <Text style={css.TextDescrisao} > Marcos Gabriel Nunes Schmalfuss </Text>
      <Text style={css.TextTitulo} > COORDENADORIA DE SAÚDE</Text>
      <Text style={css.TextDescrisao} > Marco Aurélio Farias da Silva </Text>
      
    </View>
  )
}


const css = StyleSheet.create({
  
  TextTitulo: {
    textAlign: 'center',
    padding: 10,
    color: '#00500f',
    fontSize: 16,
    textDecorationLine: 'underline',
  },

  TextDescrisao: {
    textAlign: 'center',
    padding: 5,
    color: '#00500f',
    fontSize: 14,

  }


})