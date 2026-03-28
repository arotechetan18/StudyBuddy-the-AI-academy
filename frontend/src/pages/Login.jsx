import { useState } from "react";
import api from "../api/axios";

function Login(){

 const [email,setEmail] = useState("");
 const [password,setPassword] = useState("");

 const handleLogin = async () => {

   try{

     const res = await api.post("/auth/login",{
       email,
       password
     });

     const token = res.data.token;

     localStorage.setItem("token",token);

     alert("Login Successful");

     window.location.href="/dashboard";

   }catch(err){

     alert("Invalid Email or Password");

     console.log(err);

   }

 };

 return(

 <div className="flex items-center justify-center min-h-screen bg-gray-100">

  <div className="bg-white p-8 rounded-xl shadow-lg w-96">

   <h2 className="text-2xl font-bold text-center mb-6">
    Login
   </h2>

   <input
   className="w-full border p-2 mb-4 rounded"
   placeholder="Email"
   onChange={(e)=>setEmail(e.target.value)}
   />

   <input
   type="password"
   className="w-full border p-2 mb-4 rounded"
   placeholder="Password"
   onChange={(e)=>setPassword(e.target.value)}
   />

   <button
   onClick={handleLogin}
   className="w-full bg-green-500 text-white p-2 rounded hover:bg-green-600">

     Login

   </button>

  </div>

 </div>

 );

}

export default Login;