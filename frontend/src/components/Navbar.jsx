import { Link } from "react-router-dom";

export default function Navbar() {
  return (
    <nav className="flex justify-between p-4 bg-slate-800 text-white">
      <Link to="/">AI Teacher</Link>
      <div className="space-x-4">
        <Link to="/login">Login</Link>
        <Link to="/register">Register</Link>
      </div>
    </nav>
  );
}
