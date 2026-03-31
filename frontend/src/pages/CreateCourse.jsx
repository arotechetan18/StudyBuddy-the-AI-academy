import { useState } from "react";
import api from "../api/axios";

function CreateCourse(){

const [title,setTitle] = useState("");
const [description,setDescription] = useState("");
const [price,setPrice] = useState("");
const [level,setLevel] = useState("");

const handleCreate = async () => {

 await api.post("/courses/create",{
  title,
  description,
  price,
  level
 });

 alert("Course Created");

};

return(

<div className="flex justify-center mt-20">

<div className="w-96 bg-white p-6 shadow rounded">

<h2 className="text-2xl font-bold mb-4">
Create Course
</h2>

<input
className="w-full border p-2 mb-3"
placeholder="Title"
onChange={(e)=>setTitle(e.target.value)}
/>

<input
className="w-full border p-2 mb-3"
placeholder="Description"
onChange={(e)=>setDescription(e.target.value)}
/>

<input
className="w-full border p-2 mb-3"
placeholder="Price"
onChange={(e)=>setPrice(e.target.value)}
/>

<input
className="w-full border p-2 mb-3"
placeholder="Level"
onChange={(e)=>setLevel(e.target.value)}
/>

<button
onClick={handleCreate}
className="w-full bg-green-500 text-white p-2 rounded">

Create Course

</button>

</div>

</div>

);

}

export default CreateCourse;