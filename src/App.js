
import './App.css';
import Header from './components/home/header/Header';
import { Routes,Route } from 'react-router-dom';
import HomePages from './components/pageContent/HomePages';
import Login from './components/home/header/Login';
import Signup from './components/home/header/Registration';
import Logins from './components/home/header/Logina';
import Signups from './components/home/header/Registera';
import About from './components/home/about/About';
import Service from './components/home/about/Service';
import Pricing from './components/home/header/Pricing';
import ContactUs from './components/pageContent/ContactUs';



function App() {
  return (
    <div>
      <Header/>
    <Routes>
      <Route path='/' element={<HomePages/>}/>
      <Route path='/user' element={<Login/>}/>
      <Route path='/register' element={<Signup/>}/>
      <Route path='/advisor' element={<Logins/>}/>
      <Route path='/registers' element={<Signups/>}/>
      <Route path='/streams' element={<About/>}/>
      <Route path='/services' element={<ContactUs/>}/>
      <Route path='/membership' element={<Pricing/>}/>

    </Routes>
    </div>
  );
}

export default App;
