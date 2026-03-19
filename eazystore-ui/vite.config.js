import { defineConfig } from "vite";
import react from "@vitejs/plugin-react";
import tailwindcss from "@tailwindcss/vite";

// https://vite.dev/config/
export default defineConfig({
  plugins: [react(), tailwindcss()],
  build: {
    outDir: "dist",
    sourcemap: false,
    minify: "esbuild",// unwanted tab spaces and other are removed by esbuild minifier
    rollupOptions: {
      output: {
        manualChunks: {
          vendor: ["react", "react-dom"],
          redux: ["@reduxjs/toolkit", "react-redux"],
          router: ["react-router-dom"],
          ui: [
            "@fortawesome/react-fontawesome",
            "@fortawesome/fontawesome-svg-core",
          ],
        },
      },
    },
  },
  base: "/",
  server: { port: 5173 },
  preview: { port: 5173 },
});
