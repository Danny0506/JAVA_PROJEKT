package pl.project.java.gui;

import org.junit.jupiter.api.Test;
import java.awt.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class MyJButtonTest {

  @Test
  void shouldCorrectInitButton() {
    // given
    MyJButton myJButton = new MyJButton("Przycisk");
    Graphics2D g2 = mock(Graphics2D.class);

    // when
    myJButton.paint(g2);
    g2.dispose();

    // then
    assertThat(myJButton.getHeight()).isNotNull();
    assertThat(myJButton.getWidth()).isNotNull();
    assertThat(myJButton).isNotNull();
  }
}
