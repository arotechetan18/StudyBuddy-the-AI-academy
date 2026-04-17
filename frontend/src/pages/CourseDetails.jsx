import { useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import api from "../services/api";

function CourseDetails() {

  const { id } = useParams();
  const [modules, setModules] = useState([]);

  useEffect(() => {
    fetchModules();
  }, []);

  const fetchModules = async () => {
    try {
      const res = await api.get(`/modules/${id}`);
      setModules(res.data);
    } catch (err) {
      console.log(err);
      alert("Failed to load modules");
    }
  };

  return (
    <div className="min-h-screen bg-gray-100 p-6">

      <h1 className="text-3xl font-bold mb-6 text-center">
        Course Modules
      </h1>

      <div className="max-w-3xl mx-auto">

        {modules.map((module, index) => (
          <div
            key={module.id}
            className="bg-white p-5 mb-4 rounded-lg shadow"
          >
            <h2 className="text-xl font-semibold">
              Module {index + 1}: {module.title}
            </h2>
          </div>
        ))}

      </div>
    </div>
  );
}

export default CourseDetails;