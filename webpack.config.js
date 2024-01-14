const path = require('path');

module.exports = {
  mode: 'development', // or 'production'
  entry: './src/main/js/index.jsx', // Your main JavaScript file
  output: {
     filename: 'bundle.js', // Output bundle file name
     path: path.resolve(__dirname, 'dist'), // Output folder
  },
  module: {
      rules: [
        {
          test: /\.(js|jsx)$/, // Regex to match JavaScript and JSX files
          exclude: /node_modules/,
          use: {
            loader: 'babel-loader',
            options: {
              presets: ['@babel/preset-env', '@babel/preset-react']
            }
          }
        },
        //... (any other rules)
      ]
    },

    // Optional: Resolve .jsx extensions
    resolve: {
      extensions: ['.js', '.jsx']
    },
};
