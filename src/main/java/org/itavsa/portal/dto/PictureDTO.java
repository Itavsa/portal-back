package org.itavsa.portal.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class PictureDTO {
    String path;
    String filename;
}
