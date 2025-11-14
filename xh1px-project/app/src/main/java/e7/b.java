package e7;

import A.j;
import I7.v;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import h6.AbstractC0837b;
import java.util.LinkedHashMap;
import java.util.List;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10660a = AbstractC0436k.v0(AbstractC0437l.X('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f10661b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List X8 = AbstractC0437l.X("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int k = AbstractC0837b.k(0, X8.size() - 1, 2);
        if (k >= 0) {
            int i4 = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = f10660a;
                sb.append(str);
                sb.append('/');
                sb.append((String) X8.get(i4));
                int i8 = i4 + 1;
                linkedHashMap.put(sb.toString(), X8.get(i8));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                linkedHashMap.put(j.r(sb2, (String) X8.get(i4), "Array"), "[" + ((String) X8.get(i8)));
                if (i4 == k) {
                    break;
                } else {
                    i4 += 2;
                }
            }
        }
        linkedHashMap.put(f10660a + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : AbstractC0437l.X("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : AbstractC0437l.X("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, j.o("collections/", str3), "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i9 = 0; i9 < 23; i9++) {
            String l6 = j.l("Function", i9);
            StringBuilder sb3 = new StringBuilder();
            String str4 = f10660a;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i9);
            a(linkedHashMap, l6, sb3.toString());
            a(linkedHashMap, "reflect/KFunction" + i9, str4 + "/reflect/KFunction");
        }
        for (String str5 : AbstractC0437l.X("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, AbstractC1149a.g(str5, ".Companion"), f10660a + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f10661b = linkedHashMap;
    }

    public static final void a(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(f10660a + '/' + str, "L" + str2 + ';');
    }

    public static final String b(String str) {
        o6.j.e(str, "classId");
        String str2 = (String) f10661b.get(str);
        if (str2 == null) {
            return "L" + v.Y(str, '.', '$') + ';';
        }
        return str2;
    }
}
