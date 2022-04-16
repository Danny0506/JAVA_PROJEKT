package pl.project.java.gui;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

class MyJPanelTest {

  @Test
  void shouldCorrectInitPanel() {
    // given
    MyJPanel myJPanel = new MyJPanel();
    Graphics2D g2 = mock(Graphics2D.class);

    // when
    myJPanel.paint(g2);
    g2.dispose();

    // then
    assertThat(myJPanel.getHeight()).isNotNull();
    assertThat(myJPanel.getWidth()).isNotNull();
    assertThat(myJPanel).isNotNull();
  }
}
