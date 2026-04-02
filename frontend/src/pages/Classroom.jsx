import { useState } from "react";
import api from "../api/axios";

function Classroom(){

const [content,setContent] = useState("");
const [aiResponse,setAiResponse] = useState("");

const askAI = async () => {

 const res = await api.post("/ai/explain",{
   content
 });

 setAiResponse(res.data);

};

return(

<div className="p-10">

<h2 className="text-2xl font-bold mb-4">
AI Virtual Teacher
</h2>

<textarea
className="border w-full p-3 mb-4"
placeholder="Enter lesson content"
onChange={(e)=>setContent(e.target.value)}
/>

<button
onClick={askAI}
className="bg-blue-500 text-white px-4 py-2 rounded">

Explain Lesson

</button>

<div className="mt-6 p-4 border rounded">

{aiResponse}

</div>

</div>

);

}

export default Classroom;