import HomeComponent from "./components/HomeComponent";
import MainComponent from './components/MainComponent';
import LastComponent from './components/LastComponent';
import {   Routes, Route } from 'react-router-dom';
import './App.css'

function App() {
  return (
    <>
      <Routes>
        <Route path="/home" element={<HomeComponent />} />
        <Route path="/:value" element={<MainComponent />} />
        <Route path="/:word/:textColor/:bgColor" element={<LastComponent />} />
      </Routes>
    </>
  )
}
export default App
