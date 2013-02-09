(ns me
  (:use [clojure.string :only [join]])
  )
(println (join [:a :b]))

(println (format "package net.minecraft.src;

import java.util.HashMap;
import java.util.Map;

public class MinecraftConstants {
  final public static Map<String, Block> blocks = new HashMap<String, Block>();
  final public static Map<String, Item> items = new HashMap<String, Item>();
  static {
    %s
  }
}
" "acloj"))
