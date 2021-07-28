import httpClient from "@/util/request"


export function findApplications(param) {
    return httpClient.get('/api/applications', param)
}


export function getApplicationById(id) {
    return httpClient.get(`/api/application/${id}`)
}

export function saveApplication(application) {
    return httpClient.post('/api/application', application)
}

export function deleteApplication(id) {
    return httpClient.delete(`/api/application/${id}`)
}

export function updateApplication(application, id) {
    return httpClient.put(`/api/application/${id}`, application)
}
