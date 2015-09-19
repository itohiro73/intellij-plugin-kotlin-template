import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import javax.swing.JLabel
import javax.swing.JPanel

class HelloWorldWindow() : ToolWindowFactory {

    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val parent = toolWindow.getComponent()
        val panel = JPanel()
        val label = JLabel("Hello World!!")
        panel.add(label)
        parent.add(panel)
    }

}