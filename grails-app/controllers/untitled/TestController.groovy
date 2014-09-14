package untitled

class TestController {

    def twitter4jService

    def index() {
        twitter4jService.updateStatus("test")
        render ("Status updated")
    }
}
