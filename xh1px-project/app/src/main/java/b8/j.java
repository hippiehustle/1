package b8;

import O7.Y;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import q4.X;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final k f9266a = new Object();

    public static final JsonDecodingException a(Number number, String str, String str2) {
        o6.j.e(str, "key");
        o6.j.e(str2, "output");
        return e("Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) n(str2, -1)), -1);
    }

    public static final JsonEncodingException b(Number number, String str) {
        o6.j.e(str, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) n(str, -1)));
    }

    public static final JsonEncodingException c(X7.f fVar) {
        return new JsonEncodingException("Value of type '" + fVar.b() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + fVar.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException d(int i4, String str, CharSequence charSequence) {
        o6.j.e(str, "message");
        o6.j.e(charSequence, "input");
        return e(str + "\nJSON input: " + ((Object) n(charSequence, i4)), i4);
    }

    public static final JsonDecodingException e(String str, int i4) {
        o6.j.e(str, "message");
        if (i4 >= 0) {
            str = "Unexpected JSON token at offset " + i4 + ": " + str;
        }
        return new JsonDecodingException(str);
    }

    public static final X7.f f(X7.f fVar, G5.e eVar) {
        o6.j.e(fVar, "<this>");
        o6.j.e(eVar, "module");
        if (o6.j.a(fVar.e(), X7.h.f7071e)) {
            E2.d.r(fVar);
            return fVar;
        }
        if (fVar.g()) {
            return f(fVar.j(0), eVar);
        }
        return fVar;
    }

    public static final byte g(char c6) {
        if (c6 < '~') {
            return e.f9259b[c6];
        }
        return (byte) 0;
    }

    public static final String h(X7.f fVar, a8.b bVar) {
        o6.j.e(fVar, "<this>");
        o6.j.e(bVar, "json");
        for (Annotation annotation : fVar.getAnnotations()) {
            if (annotation instanceof a8.g) {
                return ((a8.g) annotation).discriminator();
            }
        }
        return (String) bVar.f8280a.f7038e;
    }

    public static final void i(a8.b bVar, Y y4, V7.a aVar, Object obj) {
        o6.j.e(bVar, "json");
        o6.j.e(aVar, "serializer");
        kotlinx.serialization.json.internal.c[] cVarArr = new kotlinx.serialization.json.internal.c[t.k.g()];
        bVar.f8280a.getClass();
        new kotlinx.serialization.json.internal.c(new N.f(y4), bVar, t.f9290f, cVarArr).r(aVar, obj);
    }

    public static final int j(X7.f fVar, a8.b bVar, String str) {
        o6.j.e(fVar, "<this>");
        o6.j.e(bVar, "json");
        o6.j.e(str, "name");
        X6.r rVar = bVar.f8280a;
        rVar.getClass();
        o(fVar, bVar);
        int a3 = fVar.a(str);
        if (a3 != -3 || !rVar.f7036c) {
            return a3;
        }
        W5.a aVar = bVar.f8282c;
        A1.n nVar = new A1.n(fVar, 15, bVar);
        aVar.getClass();
        k kVar = f9266a;
        Object G8 = aVar.G(fVar, kVar);
        if (G8 == null) {
            G8 = nVar.a();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) aVar.f6634e;
            Object obj = concurrentHashMap.get(fVar);
            if (obj == null) {
                obj = new ConcurrentHashMap(2);
                concurrentHashMap.put(fVar, obj);
            }
            ((Map) obj).put(kVar, G8);
        }
        Integer num = (Integer) ((Map) G8).get(str);
        if (num == null) {
            return -3;
        }
        return num.intValue();
    }

    public static final int k(X7.f fVar, a8.b bVar, String str, String str2) {
        o6.j.e(fVar, "<this>");
        o6.j.e(bVar, "json");
        o6.j.e(str, "name");
        o6.j.e(str2, "suffix");
        int j = j(fVar, bVar, str);
        if (j != -3) {
            return j;
        }
        throw new IllegalArgumentException(fVar.b() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final boolean l(X7.f fVar, a8.b bVar) {
        o6.j.e(fVar, "<this>");
        o6.j.e(bVar, "json");
        bVar.f8280a.getClass();
        List annotations = fVar.getAnnotations();
        if (annotations == null || !annotations.isEmpty()) {
            Iterator it = annotations.iterator();
            while (it.hasNext()) {
                if (((Annotation) it.next()) instanceof a8.n) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static final void m(S6.e eVar, String str) {
        eVar.p(eVar.f5429b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence n(CharSequence charSequence, int i4) {
        String str;
        o6.j.e(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            String str2 = ".....";
            if (i4 == -1) {
                int length = charSequence.length() - 60;
                if (length > 0) {
                    return "....." + charSequence.subSequence(length, charSequence.length()).toString();
                }
            } else {
                int i8 = i4 - 30;
                int i9 = i4 + 30;
                if (i8 > 0) {
                    str = ".....";
                } else {
                    str = "";
                }
                if (i9 >= charSequence.length()) {
                    str2 = "";
                }
                StringBuilder a3 = AbstractC1769h.a(str);
                if (i8 < 0) {
                    i8 = 0;
                }
                int length2 = charSequence.length();
                if (i9 > length2) {
                    i9 = length2;
                }
                a3.append(charSequence.subSequence(i8, i9).toString());
                a3.append(str2);
                return a3.toString();
            }
        }
        return charSequence;
    }

    public static final void o(X7.f fVar, a8.b bVar) {
        o6.j.e(fVar, "<this>");
        o6.j.e(bVar, "json");
        if (o6.j.a(fVar.e(), X7.i.f7073e)) {
            bVar.f8280a.getClass();
        }
    }

    public static final t p(X7.f fVar, a8.b bVar) {
        o6.j.e(bVar, "<this>");
        o6.j.e(fVar, "desc");
        X e9 = fVar.e();
        if (e9 instanceof X7.c) {
            return t.f9293i;
        }
        if (o6.j.a(e9, X7.i.f7074f)) {
            return t.f9291g;
        }
        if (o6.j.a(e9, X7.i.f7075g)) {
            X7.f f8 = f(fVar.j(0), bVar.f8281b);
            X e10 = f8.e();
            if (!(e10 instanceof X7.e) && !o6.j.a(e10, X7.h.f7072f)) {
                bVar.f8280a.getClass();
                throw c(f8);
            }
            return t.f9292h;
        }
        return t.f9290f;
    }

    public static final void q(S6.e eVar, Number number) {
        S6.e.q(eVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String r(byte b4) {
        if (b4 == 1) {
            return "quotation mark '\"'";
        }
        if (b4 == 2) {
            return "string escape sequence '\\'";
        }
        if (b4 == 4) {
            return "comma ','";
        }
        if (b4 == 5) {
            return "colon ':'";
        }
        if (b4 == 6) {
            return "start of the object '{'";
        }
        if (b4 == 7) {
            return "end of the object '}'";
        }
        if (b4 == 8) {
            return "start of the array '['";
        }
        if (b4 == 9) {
            return "end of the array ']'";
        }
        if (b4 == 10) {
            return "end of the input";
        }
        if (b4 == Byte.MAX_VALUE) {
            return "invalid token";
        }
        return "valid token";
    }
}
