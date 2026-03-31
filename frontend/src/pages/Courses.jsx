import { useEffect, useState } from "react";
import api from "../api/axios";

function Courses(){

const [courses,setCourses] = useState([]);

useEffect(() => {

 fetchCourses();

},[]);

const fetchCourses = async () => {

 const res = await api.get("/courses/all");

 setCourses(res.data);

};

return(

<div className="p-10">

<h2 className="text-3xl font-bold mb-6">
Available Courses
</h2>

<div className="grid grid-cols-3 gap-6">

{courses.map((course) => (

<div key={course.id} className="border p-4 rounded shadow">

<h3 className="text-xl font-semibold">
{course.title}
</h3>

<p className="text-gray-600">
{course.description}
</p>

<p className="mt-2 font-bold">
₹ {course.price}
</p>

<p className="text-sm text-blue-500">
Level: {course.level}
</p>

<button className="mt-3 bg-blue-500 text-white px-3 py-1 rounded">
View Course
</button>

</div>

))}

</div>

</div>

);

}

export default Courses;