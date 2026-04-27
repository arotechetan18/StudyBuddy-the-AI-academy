import { useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import api from "../services/api";

function LessonPage() {

  const { id } = useParams();
  const [lesson, setLesson] = useState(null);

  useEffect(() => {
    fetchLesson();
  }, []);

  const fetchLesson = async () => {
    try {
      const res = await api.get(`/lessons/view/${id}`);
      setLesson(res.data);
    } catch (error) {
      console.log(error);
    }
  };

  if (!lesson) return <h2 className="p-10">Loading...</h2>;

  return (
    <div className="min-h-screen bg-gray-100 p-10">

      <div className="max-w-4xl mx-auto bg-white p-8 rounded-xl shadow">

        <h1 className="text-3xl font-bold mb-4">
          {lesson.title}
        </h1>

        <p className="text-gray-700 leading-8 text-lg">
          {lesson.content}
        </p>

      </div>

    </div>
  );
}

export default LessonPage;