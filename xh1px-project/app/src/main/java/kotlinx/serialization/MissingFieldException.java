package kotlinx.serialization;

import Z.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import o6.j;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "kotlinx-serialization-core"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MissingFieldException extends SerializationException {

    /* renamed from: d, reason: collision with root package name */
    public final List f12161d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(List list, String str, MissingFieldException missingFieldException) {
        super(str, missingFieldException);
        j.e(list, "missingFields");
        this.f12161d = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MissingFieldException(ArrayList arrayList, String str) {
        this(arrayList, r4, null);
        String str2;
        j.e(str, "serialName");
        if (arrayList.size() == 1) {
            str2 = "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + str + "', but it was missing";
        } else {
            str2 = "Fields " + arrayList + " are required for type with serial name '" + str + "', but they were missing";
        }
    }
}
