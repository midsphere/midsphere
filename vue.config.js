module.exports = {
    devServer: {
        proxy: {
            '/api': {
                target: 'http://localhost:8113/api',
                changeOrigin: true
            }
        }
    },
    assetsDir: './static'
}
