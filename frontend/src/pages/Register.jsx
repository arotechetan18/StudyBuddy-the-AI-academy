import { useState } from "react";
import api from "../api/axios";

function Register() {

 const [name,setName] = useState("");
 const [email,setEmail] = useState("");
 const [password,setPassword] = useState("");

 const handleRegister = async () => {

   try{
  console.log(name,email,password);
     await api.post("/users/register",{
       name,
       email,
       password
     });

     alert("Registered Successfully");

   }catch(err){
     console.log(err);
   }

 };

 return(

 <div className="flex items-center justify-center min-h-screen bg-gray-100">

   <div className="bg-white p-8 rounded-xl shadow-lg w-96">

    <h2 className="text-2xl font-bold text-center mb-6">
      Create Account
    </h2>

    <input
    className="w-full border p-2 mb-4 rounded"
    placeholder="Name"
    onChange={(e)=>setName(e.target.value)}
    />

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
    onClick={handleRegister}
    className="w-full bg-blue-500 text-white p-2 rounded hover:bg-blue-600">

      Register

    </button>

   </div>

 </div>

 );

}

export default Register;