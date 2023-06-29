package ai.grazie.text;


import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

@Serializable
public final class TextRange {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int start;
    private final int endExclusive;

    public TextRange(int start, int endExclusive) {
        this.start = start;
        this.endExclusive = endExclusive;
    }

    @JvmStatic
    public static final void write$Self(@NotNull TextRange self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeIntElement(serialDesc, 0, self.start);
        output.encodeIntElement(serialDesc, 1, self.endExclusive);
    }

    public final int getStart() {
        return this.start;
    }

    public static final class $serializer implements GeneratedSerializer<TextRange> {
        @NotNull
        public static final $serializer INSTANCE = new $serializer();

        @NotNull
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[]) GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }

        @NotNull
        public SerialDescriptor getDescriptor() {
            return (SerialDescriptor) descriptor;
        }

        @NotNull
        public KSerializer<?>[] childSerializers() {
            KSerializer[] arrayOfKSerializer = new KSerializer[2];
            arrayOfKSerializer[0] = (KSerializer) IntSerializer.INSTANCE;
            arrayOfKSerializer[1] = (KSerializer) IntSerializer.INSTANCE;
            return (KSerializer<?>[]) arrayOfKSerializer;
        }

        @NotNull
        public TextRange deserialize(@NotNull Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = getDescriptor();
            boolean bool = true;
            int i = 0, j = 0, k = 0;
            CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
            if (compositeDecoder.decodeSequentially()) {
                j = compositeDecoder.decodeIntElement(serialDescriptor, 0);
                i |= 0x1;
                k = compositeDecoder.decodeIntElement(serialDescriptor, 1);
                i |= 0x2;
            } else {
                while (bool) {
                    int m = compositeDecoder.decodeElementIndex(serialDescriptor);
                    switch (m) {
                        case -1:
                            bool = false;
                            continue;
                        case 0:
                            j = compositeDecoder.decodeIntElement(serialDescriptor, 0);
                            i |= 0x1;
                            continue;
                        case 1:
                            k = compositeDecoder.decodeIntElement(serialDescriptor, 1);
                            i |= 0x2;
                            continue;
                    }
                    throw new UnknownFieldException(m);
                }
            }
            compositeDecoder.endStructure(serialDescriptor);
            return new TextRange(i, j, k, null);
        }

        public void serialize(@NotNull Encoder encoder, @NotNull TextRange value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = getDescriptor();
            CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
            TextRange.write$Self(value, compositeEncoder, serialDescriptor);
            compositeEncoder.endStructure(serialDescriptor);
        }

        static {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.text.TextRange", INSTANCE, 2);
            pluginGeneratedSerialDescriptor.addElement("start", false);
            pluginGeneratedSerialDescriptor.addElement("endExclusive", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }
    }

    public final int getEndExclusive() {
        return this.endExclusive;
    }

    public final int getEndInclusive() {
        return this.endExclusive - 1;
    }

    public final int getLength() {
        return this.endExclusive - this.start;
    }

    public final boolean isEmpty() {
        return (this.start >= this.endExclusive);
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    @NotNull
    public final TextRange shift(int value) {
        return new TextRange(this.start + value, this.endExclusive + value);
    }

    @NotNull
    public final String substring(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullExpressionValue(text.substring(this.start, Math.min(this.endExclusive, text.length())), "this as java.lang.String…ing(startIndex, endIndex)");
        return text.substring(this.start, Math.min(this.endExclusive, text.length()));
    }

    public final boolean contains(int position) {
        int i = this.start;
        return (position < this.endExclusive) ? ((i <= position)) : false;
    }


    public final boolean contains(@NotNull TextRange range) {
        Intrinsics.checkNotNullParameter(range, "range");
        return (range.start >= this.start && range.endExclusive <= this.endExclusive);
    }

    public final boolean intersects(@NotNull TextRange other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return (this.endExclusive > other.start && other.endExclusive > this.start);
    }

    @NotNull
    public final TextRange intersect(@NotNull TextRange other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new TextRange(Math.max(this.start, other.start), Math.min(this.endExclusive, other.endExclusive));
    }

    public final boolean covers(@NotNull TextRange other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return (this.endExclusive >= other.endExclusive && this.start <= other.start);
    }


    @NotNull
    public final TextRange[] subtract(@NotNull TextRange other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (!intersects(other)) {
            TextRange[] arrayOfTextRange1 = new TextRange[1];
            arrayOfTextRange1[0] = this;
            return arrayOfTextRange1;
        }

        if (other.isEmpty()) {
            TextRange[] arrayOfTextRange1 = new TextRange[1];
            arrayOfTextRange1[0] = this;
            return arrayOfTextRange1;
        }
        if (isEmpty()) {
            TextRange[] arrayOfTextRange1 = new TextRange[1];
            arrayOfTextRange1[0] = this;
            return arrayOfTextRange1;
        }

        if (other.contains(this)) {
            int $i$f$emptyArray = 0;
            return


                    new TextRange[0];
        }
        if (contains(other)) {
            TextRange[] arrayOfTextRange1 = new TextRange[2];
            arrayOfTextRange1[0] = new TextRange(this.start, other.start);
            arrayOfTextRange1[1] = new TextRange(other.endExclusive, this.endExclusive);
            arrayOfTextRange1 = arrayOfTextRange1;
            int $i$f$filter = 0;
            TextRange[] arrayOfTextRange2 = arrayOfTextRange1;
            Collection<Object> destination$iv$iv = new ArrayList();
            int $i$f$filterTo = 0;
            byte b1;
            int k;
            for (b1 = 0, k = arrayOfTextRange2.length; b1 < k; ) {
                Object element$iv$iv = arrayOfTextRange2[b1], object1 = element$iv$iv;
                int $i$a$ -filter - TextRange$subtract$1 = 0;
                if (object1.isNotEmpty()) destination$iv$iv.add(element$iv$iv);
            }
            List list = (List) destination$iv$iv;
            int j = 0;
            Collection collection = list;
            return (TextRange[]) collection.toArray((Object[]) new TextRange[0]);
        }
        TextRange intersection = intersect(other);
        if (intersection.isEmpty()) {
            int $i$f$emptyArray = 0;
            return new TextRange[0];
        }
        ArrayList<TextRange> result = new ArrayList();
        TextRange[] arrayOfTextRange;
        byte b;
        int i;
        for (arrayOfTextRange = subtract(intersection), b = 0, i = arrayOfTextRange.length; b < i; ) {
            TextRange value = arrayOfTextRange[b];
            TextRange previous = (TextRange) CollectionsKt.lastOrNull(result);
            if (previous == null || previous.endExclusive != value.start) {
                result.add(value);
            } else {
                CollectionsKt.removeLast(result);
                result.add(new TextRange(previous.start, value.endExclusive));
            }
            b++;
        }
        Collection<TextRange> $this$toTypedArray$iv = result;
        int $i$f$toTypedArray = 0;
        Collection<TextRange> thisCollection$iv = $this$toTypedArray$iv;
        return thisCollection$iv.<TextRange>toArray(new TextRange[0]);
    }

    public final int component1() {
        return this.start;
    }

    public final int component2() {
        return this.endExclusive;
    }

    @NotNull
    public final TextRange copy(int start, int endExclusive) {
        return new TextRange(start, endExclusive);
    }

    @NotNull
    public String toString() {
        return "TextRange(start=" + this.start + ", endExclusive=" + this.endExclusive + ")";
    }

    public int hashCode() {
        result = Integer.hashCode(this.start);
        return result * 31 + Integer.hashCode(this.endExclusive);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other)
            return true;
        if (!(other instanceof TextRange))
            return false;
        TextRange textRange = (TextRange) other;
        return (this.start != textRange.start) ? false : (!(this.endExclusive != textRange.endExclusive));
    }

    @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\021\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\033\020\003\032\004\030\0010\0042\f\020\005\032\b\022\004\022\0020\0040\006¢\006\002\020\007J\021\020\b\032\0020\0042\006\020\t\032\0020\nH\002J\017\020\013\032\b\022\004\022\0020\0040\fHÆ\001¨\006\r"}, d2 = {"Lai/grazie/text/TextRange$Companion;", "", "()V", "covering", "Lai/grazie/text/TextRange;", "ranges", "", "([Lai/grazie/text/TextRange;)Lai/grazie/text/TextRange;", "invoke", "range", "Lkotlin/ranges/IntRange;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-text"})
    @SourceDebugExtension({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nai/grazie/text/TextRange$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<TextRange> serializer() {
            return (KSerializer<TextRange>) TextRange.$serializer.INSTANCE;
        }

        @NotNull
        public final TextRange invoke(@NotNull IntRange range) {
            Intrinsics.checkNotNullParameter(range, "range");
            return new TextRange(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
        }

        @Nullable
        public final TextRange covering(@NotNull TextRange[] ranges) {
            Intrinsics.checkNotNullParameter(ranges, "ranges");
            if ((ranges.length == 0))
                return null;
            TextRange[] arrayOfTextRange = ranges;
            if ((arrayOfTextRange.length == 0))
                throw new NoSuchElementException();
            TextRange textRange1 = arrayOfTextRange[0];
            int $i$a$ -minOf - TextRange$Companion$covering$1 = 0;
            int j;
            IntIterator intIterator2;
            for (j = textRange1.getStart(), intIterator2 = (new IntRange(1, ArraysKt.getLastIndex((Object[]) arrayOfTextRange))).iterator(); intIterator2.hasNext(); ) {
                int i2 = intIterator2.nextInt();
                TextRange textRange = arrayOfTextRange[i2];
                int i4 = 0;
                int i3 = textRange.getStart();
                if (j > i3)
                    j = i3;
            }
            arrayOfTextRange = ranges;
            int k = j;
            if ((arrayOfTextRange.length == 0))
                throw new NoSuchElementException();
            TextRange it = arrayOfTextRange[0];
            int $i$a$ -maxOf - TextRange$Companion$covering$2 = 0;
            int i;
            IntIterator intIterator1;
            for (i = it.getEndExclusive(), intIterator1 = (new IntRange(1, ArraysKt.getLastIndex((Object[]) arrayOfTextRange))).iterator(); intIterator1.hasNext(); ) {
                int i2 = intIterator1.nextInt();
                TextRange textRange = arrayOfTextRange[i2];
                int i4 = 0;
                int i3 = textRange.getEndExclusive();
                if (i < i3)
                    i = i3;
            }
            int m = i, n = m, i1 = k;
            return new TextRange(i1, n);
        }
    }
}
