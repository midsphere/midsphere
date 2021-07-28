import axios from 'axios'

const httpClient = axios.create({
    baseURL: 'http://localhost:8113',
    timeout: 1000000,
    withCredentials: true,
    headers: {
        'Content-Type': 'application/json'
    }
})

httpClient.interceptors.request.use(function(config) {
    return config
}, function(error) {
    return Promise.reject(error)
})

httpClient.interceptors.response.use(function(response ){
    return response.data
}, function(error) {
    return Promise.reject(error)
})

export default httpClient
