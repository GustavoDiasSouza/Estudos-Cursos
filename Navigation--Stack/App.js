import React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createStackNavigator } from '@react-navigation/stack';

import Home from './src/Pages/Home/'
import Conheca from './src/Pages/Conheca/'
import Cursos from './src/Pages/Cursos/'
import Equipe from './src/Pages/Equipe/'
import TDS from './src/Pages/TDS/'

const Stack = createStackNavigator();

export default function App(){
  return(
    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen name="Página Inicial" component={Home} />
        <Stack.Screen name="Conheça o CAVG" component={Conheca} />
        <Stack.Screen name="Equipe" component={Equipe} />
        <Stack.Screen name="Curso TDS" component={TDS} />
        <Stack.Screen name="Cursos" component={Cursos} />
      </Stack.Navigator>
    </NavigationContainer>
  )
}

