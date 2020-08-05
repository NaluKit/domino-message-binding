package com.nalukit.domino.message.binding.client.internal.handler;

import com.nalukit.domino.message.binding.shared.model.IsDominoMessage;
import elemental2.dom.Element;

import java.util.List;

@FunctionalInterface
public interface ValidHandler {

  void onValid(Element element,
               List<IsDominoMessage> messages);

}
