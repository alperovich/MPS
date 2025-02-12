/*
 * Copyright 2003-2011 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.util.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Vertex implements IVertex {
  private double myX;
  private double myY;
  private List<IEdge> myStar = new ArrayList<IEdge>();
  private String myName;
  private Map myUserObjects = new HashMap();

  public Vertex(int x, int y, String name) {
    myX = x;
    myY = y;
    myName = name;
  }

  public Vertex(int x, int y) {
    this(x, y, "?");
  }

  @Override
  public double getX() {
    return myX;
  }

  @Override
  public double getY() {
    return myY;
  }

  @Override
  public int getWidth() {
    return 0;
  }

  @Override
  public int getHeight() {
    return 0;
  }

  @Override
  public String getName() {
    return myName;
  }

  public String toString() {
    return myName + "(" + myX + "," + myY + ")";
  }

  @Override
  public List<IEdge> getStar() {
    return new ArrayList<IEdge>(myStar);
  }

  @Override
  public int getStarSize() {
    return myStar.size();
  }

  @Override
  public void addEdge(IEdge e) {
    myStar.add(e);
  }

  @Override
  public void trySetCoords(double newx, double newy) {
    myX = newx;
    myY = newy;
  }

  @Override
  public void setCoords(double newx, double newy) {
    trySetCoords(newx, newy);
    confirmCoords();
  }

  @Override
  public void confirmCoords() {

  }

  @Override
  public Object getUserObject(Object key) {
    return myUserObjects.get(key);
  }

  @Override
  public void putUserObject(Object key, Object value) {
    myUserObjects.put(key, value);
  }

  @Override
  public void removeUserObject(Object key) {
    myUserObjects.remove(key);
  }
}
