/*
 * Copyright © 2023 Mark Raynsford <code@io7m.com> https://www.io7m.com
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY
 * SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR
 * IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */


package com.io7m.ezcanvas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public final class EzCanvas extends JPanel
  implements MouseListener, MouseMotionListener, KeyListener
{
  private int circleX;
  private int circleY;

  private EzCanvas()
  {
    this.addMouseListener(this);
    this.addMouseMotionListener(this);
  }

  public static void main(
    final String[] args)
  {
    SwingUtilities.invokeLater(() -> {
      try {
        final var frame = new JFrame("EZCanvas");
        frame.setPreferredSize(new Dimension(800, 600));
        frame.getContentPane().add(new EzCanvas());
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
      } catch (final Exception e) {
        throw new RuntimeException(e);
      }
    });
  }

  @Override
  public void paint(
    final Graphics g)
  {
    g.setColor(Color.BLUE);
    g.fillRect(0, 0, this.getWidth(), this.getHeight());

    g.setColor(Color.WHITE);
    g.fillOval(this.circleX, this.circleY, 8, 8);
  }

  @Override
  public void mouseClicked(
    final MouseEvent e)
  {

  }

  @Override
  public void mousePressed(
    final MouseEvent e)
  {

  }

  @Override
  public void mouseReleased(
    final MouseEvent e)
  {

  }

  @Override
  public void mouseEntered(
    final MouseEvent e)
  {

  }

  @Override
  public void mouseExited(
    final MouseEvent e)
  {

  }

  @Override
  public void mouseDragged(
    final MouseEvent e)
  {

  }

  @Override
  public void mouseMoved(
    final MouseEvent e)
  {
    this.circleX = e.getX();
    this.circleY = e.getY();
    this.repaint();
  }

  @Override
  public void keyTyped(
    final KeyEvent e)
  {

  }

  @Override
  public void keyPressed(
    final KeyEvent e)
  {

  }

  @Override
  public void keyReleased(
    final KeyEvent e)
  {

  }
}
