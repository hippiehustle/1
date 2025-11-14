package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f8607a;

    static {
        char[] cArr = new char[80];
        f8607a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i4, StringBuilder sb) {
        while (i4 > 0) {
            int i8 = 80;
            if (i4 <= 80) {
                i8 = i4;
            }
            sb.append(f8607a, 0, i8);
            i4 -= i8;
        }
    }

    public static void b(StringBuilder sb, int i4, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i4, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i4, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i4, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i8 = 1; i8 < str.length(); i8++) {
                char charAt = str.charAt(i8);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            C0471g c0471g = C0471g.f8681f;
            sb.append(E2.b.o(new C0471g(((String) obj).getBytes(AbstractC0486w.f8742a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0471g) {
            sb.append(": \"");
            sb.append(E2.b.o((C0471g) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0484u) {
            sb.append(" {");
            c((AbstractC0484u) obj, sb, i4 + 2);
            sb.append("\n");
            a(i4, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i9 = i4 + 2;
            b(sb, i9, "key", entry.getKey());
            b(sb, i9, "value", entry.getValue());
            sb.append("\n");
            a(i4, sb);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x019a, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019c, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01af, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c5, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(AbstractC0484u abstractC0484u, StringBuilder sb, int i4) {
        int i8;
        int i9;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC0484u.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i10 = 0;
        while (true) {
            i8 = 3;
            if (i10 >= length) {
                break;
            }
            Method method3 = declaredMethods[i10];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i10++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i8);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null) {
                i9 = i8;
                if (method2.getReturnType().equals(List.class)) {
                    b(sb, i4, substring.substring(0, substring.length() - 4), AbstractC0484u.e(method2, abstractC0484u, new Object[0]));
                    i8 = i9;
                }
            } else {
                i9 = i8;
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb, i4, substring.substring(0, substring.length() - 3), AbstractC0484u.e(method, abstractC0484u, new Object[0]));
            } else if (hashSet.contains("set".concat(substring))) {
                if (substring.endsWith("Bytes")) {
                    if (treeMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object e9 = AbstractC0484u.e(method4, abstractC0484u, new Object[0]);
                    if (method5 == null) {
                        booleanValue = true;
                        if (e9 instanceof Boolean) {
                            equals = !((Boolean) e9).booleanValue();
                        } else if (!(e9 instanceof Integer)) {
                            if (!(e9 instanceof Float)) {
                                if (!(e9 instanceof Double)) {
                                    if (e9 instanceof String) {
                                        equals = e9.equals("");
                                    } else if (e9 instanceof C0471g) {
                                        equals = e9.equals(C0471g.f8681f);
                                    } else {
                                        equals = !(e9 instanceof AbstractC0465a) ? false : false;
                                    }
                                }
                            }
                        }
                        if (equals) {
                            booleanValue = false;
                        }
                    } else {
                        booleanValue = ((Boolean) AbstractC0484u.e(method5, abstractC0484u, new Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        b(sb, i4, substring, e9);
                    }
                }
            }
            i8 = i9;
        }
        Z z8 = abstractC0484u.unknownFields;
        if (z8 != null) {
            for (int i11 = 0; i11 < z8.f8657a; i11++) {
                b(sb, i4, String.valueOf(z8.f8658b[i11] >>> 3), z8.f8659c[i11]);
            }
        }
    }
}
