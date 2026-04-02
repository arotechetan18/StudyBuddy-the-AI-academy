import { BrowserRouter, Routes, Route } from "react-router-dom";
import Login from "./pages/Login";
import Register from "./pages/Register";
import Courses from "./pages/Courses";
import CreateCourse from "./pages/CreateCourse";
import Classroom from "./pages/Classroom";


function App() {

    return (

        <BrowserRouter>

            <Routes>

                <Route path="/courses" element={<Courses />} />
                <Route path="/create-course" element={<CreateCourse />} />
                <Route path="/login" element={<Login />} />
                <Route path="/register" element={<Register />} />

                <Route path="/classroom" element={<Classroom />} />

            </Routes>

        </BrowserRouter>

    );

}

export default App;